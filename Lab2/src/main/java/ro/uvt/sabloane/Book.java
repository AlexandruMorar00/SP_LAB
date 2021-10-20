package ro.uvt.sabloane;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class Book {

 private final String title;
 private Collection<Author> authors = new ArrayList<>();
 private ArrayList<Chapter> chapters = new ArrayList<>();

 public Book(String title){
  this.title=title;
 }


 public void addAuthor(Author autor) {
  authors.add(autor);
 }
 public void removeAuthor(Author autor){
  authors.remove(autor);
 }
 public Collection<Author> getAuthors() {
  return authors;
 }


public int createChapter(String nume){
  chapters.add(new Chapter(nume));
  return chapters.indexOf(nume)+1;
}



//public Chapter getChapter(int i){
// for(Chapter el:chapters){
 // if(el.getIndex)




}
