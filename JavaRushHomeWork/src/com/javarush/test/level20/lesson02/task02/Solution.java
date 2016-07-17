package com.javarush.test.level20.lesson02.task02;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* Читаем и пишем в файл: JavaRush
Реализуйте логику записи в файл и чтения из файла для класса JavaRush
В файле your_file_name.tmp может быть несколько объектов JavaRush
Метод main реализован только для вас и не участвует в тестировании
*/
public class Solution
{
    public static void main(String[] args)
    {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try
        {
            File your_file_name = new File("E:/Test");
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user = new User();
            user.setFirstName("Stas");
            user.setLastName("Pugach");
            user.setBirthDate(new Date(123456789));
            user.setMale(true);
            user.setCountry(User.Country.UKRAINE);
            javaRush.users.add(user);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны
            User user1 = loadedObject.users.get(0);
            System.out.println(user1.getFirstName()+
                    " "+user1.getLastName()+
                    " "+user1.getBirthDate()+
                    " "+user1.getCountry()+
                    " "+user1.isMale()
            );
            


            outputStream.close();
            inputStream.close();

        }
        catch (IOException e)
        {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        }
        catch (Exception e)
        {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush
    {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception
        {
            //implement this method - реализуйте этот метод
            PrintWriter writer = new PrintWriter(outputStream);

            if (!users.isEmpty()){
                for (User currentUser : users)
                {
                    if (currentUser.getFirstName() != null){
                        writer.println("yes");
                        writer.println(currentUser.getFirstName());
                    }
                    else writer.println("no");

                    if (currentUser.getLastName() != null){
                        writer.println("yes");
                        writer.println(currentUser.getLastName());
                    }
                    else writer.println("no");

                    if (currentUser.getBirthDate() != null){
                        writer.println("yes");
                        Date date = currentUser.getBirthDate();
                        writer.println(date.getTime());
                    }
                    else writer.println("no");

                    writer.println(currentUser.isMale());

                    if (currentUser.getCountry() != null){
                        writer.println("yes");
                        writer.println(currentUser.getCountry());
                    }
                    else writer.println("no");
                    writer.flush();
                    writer.close();
                }
            }

        }

        public void load(InputStream inputStream) throws Exception
        {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            User user = new User();
            String isFirstNamePresent = reader.readLine();
            if (isFirstNamePresent.equals("yes"))
                user.setFirstName(reader.readLine());
            String isLastNamePresent = reader.readLine();
            if (isLastNamePresent.equals("yes"))
                user.setLastName(reader.readLine());
            String isBirthDatePresent = reader.readLine();
            if (isBirthDatePresent.equals("yes")){
                Date date = new Date(Long.parseLong(reader.readLine()));
                user.setBirthDate(date);
            }
            String Male = reader.readLine();
            if (Male.equals("true"))
                user.setMale(true);
            else user.setMale(false);
            String isCountryPresent = reader.readLine();
            if (isCountryPresent.equals("yes"))
                user.setCountry(User.Country.valueOf(reader.readLine()));
            users.add(user);
            reader.close();
        }
    }
}
