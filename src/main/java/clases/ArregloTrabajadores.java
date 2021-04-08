package clases;

import java.util.ArrayList;

public class ArregloTrabajadores {

    private ArrayList<Trabajador> tra;

    public ArregloTrabajadores() {

        tra = new ArrayList();

        tra.add(new Trabajador("Erick", 1824));
        tra.add(new Trabajador("Carla", 4220));
        tra.add(new Trabajador("Fiorela", 1320));
        tra.add(new Trabajador("Kristel", 3560));
        tra.add(new Trabajador("Sebastian", 1620));
        tra.add(new Trabajador("Anna", 5780));
        tra.add(new Trabajador("Pamela", 3900));
        tra.add(new Trabajador("Rodolfo", 1340));

    }

    public int tamaño() {

        return tra.size();
    }

    public Trabajador obtener(int p) {

        return tra.get(p);
    }

    public ArrayList<Trabajador> listado() {

        return tra;
    }

    public void adicionar(Trabajador d) {

        tra.add(d);
    }

    // Metodos de cálculo
    public double sumatoria() {

        double sm = 0;

        for (Trabajador x : tra) {

            sm = sm + x.sueldoNeto();
        }

        return sm;
    }

    public double mayorSueldo() {

        double max = obtener(0).sueldoNeto();

        for (Trabajador x : tra) {

            if (x.sueldoNeto() > max) {

                max = x.sueldoNeto();
            }
        }

        return max;
    }

    public double cantidadTrabjadores() {

        double contador = 0;

        for (Trabajador x : tra) {

            if (x.sueldoNeto() > 2800) {

                contador++;
            }
        }

        return contador;
    }

    // Buscar el registro x codigo
    public Trabajador busca(String cod) {

        for (Trabajador x : tra) {

            if (x.getCodigo().equals(cod)) {

                return x;
            }
        }

        return null;
    }

    // Anular docente
    public void anula(Trabajador d) {

        tra.remove(d);
    }
}
