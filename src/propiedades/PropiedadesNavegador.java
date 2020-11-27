package propiedades;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class PropiedadesNavegador {

    public static void main(String[] args) {


        ChromeOptions chromeOptions = new ChromeOptions();
        //elijo la posicion de la ventana
        chromeOptions.addArguments("--window-position=850,0");
        //cambio el tamaño
        chromeOptions.addArguments("--window-size=800,500");
        // para no habrir navegador
        chromeOptions.addArguments("--headless");
            WebDriver driverCd = new ChromeDriver(chromeOptions);


            driverCd.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");

            driverCd.manage().window().fullscreen(); //ocupa toda la pantalla

        String titulo= driverCd.getTitle();
        System.out.println(titulo);
        driverCd.close();



    }
    }

