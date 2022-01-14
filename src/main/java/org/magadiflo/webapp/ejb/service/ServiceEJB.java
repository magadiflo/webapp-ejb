package org.magadiflo.webapp.ejb.service;

import jakarta.ejb.Stateful;
import jakarta.ejb.Stateless;
import jakarta.enterprise.context.RequestScoped;

/******* Esta clase es un EJB *********
 * @Stateless, este tipo de anotación (que es un tipo de EJB) convierte a la clase precisamente en un EJB
 * NOTA: el stateless (sin estado) es compartido, una sola instancia compartido por los usuarios
 *
 * @Stateful (con estado), es único por cada cliente
 * NOTA: No es buena idea inserar un EJB stateful en un servlet, ya que el servlet es compartido por todos los clientes,
 * eso significa que por cada request que se haga al servlet todos los usuarios obtendrán el mismo atributo del EJB.
 * es decir el artibuto EJB no cambia, siempre será el mismo.
 * ¿Cuál sería la solución si queremos que cada req tenga instancias distintas?, allí se tendría que usar contexto,
 * es decir... este EJB con estado debe estar en contexto de ReqyestScope, o de SessionScope.
 * Lo recomendable es usar @Stateless en los servlet
 */
//@RequestScoped //solo aplica si se usa @Inject en las clases a inyectar y además si la clase donde se le declara es de @Stateful
//@Stateful
@Stateless
public class ServiceEJB implements ServiceEJBLocal {

    private int contador;

    @Override
    public String saludar(String nombre) {
        System.out.println("Imprimiendo dentro del ejb con instancia: " + this);
        this.contador++;
        System.out.println("Valor del contador en el metodo saludar: " + contador);
        return "Hola que tal " + nombre;
    }

}
