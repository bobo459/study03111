package Study20240729;
class Book {
    String name ;
    String writer;
    String ISBN ;
    String year ;
    int inventory;

    public Book(String name, String writer, String ISBN, String year, int inventory) {
        this.name = name;
        this.writer = writer;
        this.ISBN = ISBN;
        this.year = year;
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    void toStrings(){

        System.out.println( "제목 : "+ name);
        System.out.println( "저자 : "+writer);
        System.out.println( "ISBN : "+ISBN);
        System.out.println( "출판년도 : "+year);
        System.out.println( "재고수량 : "+inventory);
        //System.out.println( "제목 : "+ name+" "+"저자 : "+liter+" "+"ISBN : "+ISBN+" "+"출판년도 : "+year+" "+"재고수량 : "+imbentory+" ");

    }
}

