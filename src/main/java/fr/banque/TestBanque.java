package fr.banque;

import java.math.BigDecimal;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.banque.entities.Client;
import fr.banque.entities.Compte;
import fr.banque.service.ClientService;
import fr.banque.service.CompteService;

public class TestBanque {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("SpringHibernate.xml");

        ClientService clientDao = ctx.getBean("clientServiceImpl", ClientService.class);

        CompteService compteDao = ctx.getBean("compteServiceImpl", CompteService.class);


          Client client= new Client(); 
          client.setIdclient(new BigDecimal(5));
          client.setNom("ciara"); 
          client.setPrenom("ciara");
          client.setAdresse("paris"); 
          clientDao.add(client);

        Compte compte = new Compte();
        compte.setIdcompte(new BigDecimal(3));
        compte.setNomcompte("epargne");

        compte.setClient(client);
        compteDao.add(compte);





        ctx.close();
    }

}