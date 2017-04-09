
public class News {
    public int Id;
    public String Name, Date, Title, Description, Details, Category, Image;

    public News(int id, String name, String date, String title, String description, String details, String category, String image) {
        this.Id = id;
        this.Name = name;
        this.Date = date;
        this.Title = title;
        this.Description = description;
        this.Details = details;
        this.Category = category;
        this.Image = image;
    }

    public News() {

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }


}