package ro.uvt.sabloane;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Book {

 private final String title;
 private ArrayList<Author> authors = new ArrayList<>();
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
 public ArrayList<Author> getAuthors() {
  return authors;
 }



}
