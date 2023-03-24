package com.formacionbdi.springboot.app.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/*este mircoservicio nos brindara una Administración central para la configuración a través de Git, 
 * SVN o HashiCorp Vault. de todos nuestros microservicios , podriamos tener una gran arquitectura con varios
 * microservicios y cada una con configuracion por separada y ademas con diferentes ambientes y si sumamos 
 * cada microservicio y cada una de ellos con diferentes ambientes o entornos por ejemplo produccion, testing
 * desarrollo vamos a tener muchas configuraciones entonces lo ideal es centrar en algun lugar toda esta
 * configuracion y poder administrarla justo es lo que se encarga spring cloud config server, por defecto  
 * esta configuracion se puede almacenar en un repositorio de git ya sea de forma local o remota , ademas 
 * se puede administrar de forma fisica en algun directorio de nuestro equi
 * habilitamos como un servidor de configuracion */

/*NOTA: TODOS LOS CLIENTES DE ESTE SERVIDOR DE CONFIGURACION DEBERAN AGREGAR LA DEPENDENCIA 
     <dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-bootstrap</artifactId>
		</dependency>
  
 * */

@EnableConfigServer
@SpringBootApplication
public class SpringbootServicioConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioConfigServerApplication.class, args);
	}

}
