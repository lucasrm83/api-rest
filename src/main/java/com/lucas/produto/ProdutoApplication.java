package com.lucas.produto;

import com.lucas.produto.entities.Category;
import com.lucas.produto.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProdutoApplication implements CommandLineRunner {
    @Autowired
    private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProdutoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(1L, "Eletronics");
		Category cat2 = new Category(2L, "Books");
        categoryRepository.save(cat1);
        categoryRepository.save(cat2);
	}
}
