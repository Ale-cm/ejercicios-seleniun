package propiedades;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class PropiedadesNavegador {

    public static void main(String[] args) {


        ChromeOptions chromeOptions = new ChromeOptions();
        //elijo la posicion de la ventana
        chromeOptions.addArguments("--window-position=850,0");

            WebDriver driverCd = new ChromeDriver(chromeOptions);


            driverCd.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");

        }
    }

