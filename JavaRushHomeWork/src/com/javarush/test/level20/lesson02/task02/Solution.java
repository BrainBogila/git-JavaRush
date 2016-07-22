package com.javarush.test.level20.lesson02.task02;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

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
            for (int i = 0; i < 5; i++)
            {
                User user = new User();
                user.setFirstName("Stas" + i);
                user.setLastName("Pugach" + i);
                user.setBirthDate(new Date(123456789));
                user.setMale(true);
                user.setCountry(User.Country.UKRAINE);
                javaRush.users.add(user);
            }

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны
            for (User num : loadedObject.users)
            {
                System.out.println(num.getFirstName() +
                        " " + num.getLastName() +
                        " " + num.getBirthDate() +
                        " " + num.getCountry() +
                        " " + num.isMale()
                );
            }
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

            for (int i = 0; i < users.size(); i++)
            {
                if (users.get(i).getFirstName() != null)
                {
                    writer.println("yes");
                    writer.println(users.get(i).getFirstName());
                } else writer.println("no");

                if (users.get(i).getLastName() != null)
                {
                    writer.println("yes");
                    writer.println(users.get(i).getLastName());
                } else writer.println("no");

                if (users.get(i).getBirthDate() != null)
                {
                    writer.println("yes");
                    Date date = users.get(i).getBirthDate();
                    writer.println(date.getTime());
                } else writer.println("no");

                writer.println(users.get(i).isMale());

                if (users.get(i).getCountry() != null)
                {
                    writer.println("yes");
                    writer.println(users.get(i).getCountry());
                } else writer.println("no");
            }
            writer.flush();
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception
        {
            //implement this method - реализуйте этот метод
            Scanner scanner  = new Scanner(inputStream);
            while (scanner.hasNext())
            {
                User user = new User();
                String isFirstNamePresent = scanner .nextLine();
                if (isFirstNamePresent.equals("yes"))
                    user.setFirstName(scanner .nextLine());
                String isLastNamePresent = scanner .nextLine();
                if (isLastNamePresent.equals("yes"))
                    user.setLastName(scanner .nextLine());
                String isBirthDatePresent = scanner .nextLine();
                if (isBirthDatePresent.equals("yes"))
                {
                    Date date = new Date(Long.parseLong(scanner .nextLine()));
                    user.setBirthDate(date);
                }
                String Male = scanner .nextLine();
                if (Male.equals("true"))
                    user.setMale(true);
                else user.setMale(false);
                String isCountryPresent = scanner .nextLine();
                if (isCountryPresent.equals("yes"))
                    user.setCountry(User.Country.valueOf(scanner .nextLine()));
                users.add(user);
            }
        }

    }

}

