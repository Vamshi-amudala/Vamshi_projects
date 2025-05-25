package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.en.Employ;
import com.example.demo.repo.Myrepo;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.demo.repo")
public class SpringJpaApplication {

    private final Myrepo myrepo;

    SpringJpaApplication(Myrepo myrepo) {
        this.myrepo = myrepo;
    }

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJpaApplication.class, args);
		Myrepo b1=context.getBean(Myrepo.class);
		Employ e=new Employ(104,"Vamshi",300.00);
		Employ e1 = new Employ(105,"Sai",45.20);
		Employ e2 = new Employ(106,"Sudh",98.1);
		b1.save(e);
		b1.save(e1);
		b1.save(e2);
		
		System.out.println(b1.count());
		System.out.println(b1.findAll());
		System.out.println(b1.findById(103));
		System.out.println(b1.hashCode());
		
	}

}