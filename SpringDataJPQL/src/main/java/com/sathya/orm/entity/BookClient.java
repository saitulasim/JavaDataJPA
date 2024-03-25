package com.sathya.orm.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sathya.orm.repository.BookRepository;

@Component
public class BookClient implements CommandLineRunner {
@Autowired
BookRepository bookRepository;
	@Override
	public void run(String... args) throws Exception {
List<String> books = bookRepository.getData();
for(String book : books)
{
	System.out.println(book);
}
int count = bookRepository.authorCount("ratan");
System.out.println("No of books"+ count);
List<String> list = bookRepository.authorDistinct();
System.out.println(list);
	}
	

}
