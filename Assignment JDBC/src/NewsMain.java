
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class NewsMain {
    public static void main(String[] args) throws IOException {
        News news = new News();
        NewsManager newsManager = new NewsManager();
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.println(String.format(" 1.Create\n 2.Read\n 3.Delete\n 4.ShowAll\n 5.Exit"));
            System.out.println("Enter: ");
            input = sc.nextInt();
            sc.nextLine();
            switch (input) {
                case 1:
                    System.out.println("Enter id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter Date ex:2016-11-20 : ");
                    String date = sc.nextLine();
                    System.out.println("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.println("Enter Description: ");
                    String description = sc.nextLine();
                    System.out.println("Enter Details: ");
                    String details = sc.nextLine();
                    System.out.println("Enter Category: ");
                    String category = sc.nextLine();
                    System.out.println("Enter Image ex: C:\\Assignment\\image\\example.jpg: ");
                    String image = sc.nextLine();
                    newsManager.InsertNews(new News(id, name, date, title, description, details, category, image));
                    break;
                case 2:
                    System.out.println("Show one new , Enter  id : ");
                    int id1 = sc.nextInt();
                    sc.nextLine();
                    List<News> show = newsManager.getOneNews(id1);
                    show.forEach(x -> {
                        System.out.printf("%-7d %-55s %-15s %-20s %-40s %-180s %-15s %-20s", x.Id, x.Name, x.Date, x.Title
                                , x.Description, x.Details, x.Category, x.Image);
                        System.out.println();
                    });
                    break;
                case 3:
                    System.out.println("Enter delete with id: ");
                    int id2 = sc.nextInt();
                    sc.nextLine();
                    newsManager.DeletetNews(id2);
                    break;
                case 4:
                    List<News> data = newsManager.getAllNews();
                    data.forEach(x -> {
                        System.out.printf("%-7d %-55s %-15s %-20s %-40s %-180s %-15s %-20s", x.Id, x.Name, x.Date, x.Title
                                , x.Description, x.Details, x.Category, x.Image);
                        System.out.println();
                    });
                    break;
                case 5:
                    System.out.println("You did exit!");
                    break;
                default:
                    System.out.println("You did choice the wrong!");
                    break;
            }
        } while (input != 5);

    }


}

