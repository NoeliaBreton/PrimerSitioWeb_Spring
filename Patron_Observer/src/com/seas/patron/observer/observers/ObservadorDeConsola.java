package com.seas.patron.observer.observers;

import com.seas.patron.observer.interfaces.base.IObservable;
import com.seas.patron.observer.interfaces.base.IObserver;

/**
 * Clase que implementa la interfaz IObserver y que estara pendiente del estado
 * de un objeto tiempo, mostrandolo por la salida estandar o consola cada vez
 * que le sea notificado un cambio.
 *
 * @author SEAS - Estudios Abiertos
 */
public class ObservadorDeConsola implements IObserver {

    private IObservable observable;

    /**
     * Constructor unico de la clase ObservadorDeConsola.
     * @param observable IObservable a observar.
     */
    public ObservadorDeConsola(IObservable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    /**
     * Metodo implementado de la interfaz IObserver que muestra por consola el 
     * objeto observable como una cadena.
     */
    @Override
    public void update() {
        System.out.println("" + observable.toString());
    }
}
