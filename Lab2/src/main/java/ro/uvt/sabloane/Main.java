package ro.uvt.sabloane;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book discoTitanic = new Book("Disco Titanic");
        Author rpGheo = new Author("Radu Pavel Gheo");
        discoTitanic.addAuthor(rpGheo);

        ArrayList<Author> a = discoTitanic.getAuthors();
        a.add(new Author("Mircea Cartarescu"));
        System.out.println(a);

//        int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
//        Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
//        int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");
//        SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
//        scOneOne.createNewParagraph("Paragraph 1");
//        scOneOne.createNewParagraph("Paragraph 2");
//        scOneOne.createNewParagraph("Paragraph 3");
//        scOneOne.createNewImage("Image 1");
//        scOneOne.createNewParagraph("Paragraph 4");
//        scOneOne.createNewTable("Table 1");
//        scOneOne.createNewParagraph("Paragraph 5");
//        scOneOne.print();
    }
}
