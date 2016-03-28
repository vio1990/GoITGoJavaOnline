package com.ozerian.enterprise.module3;

import com.ozerian.enterprise.module3.interfaces.Semaphore;

/**
 * This class is the example of implementation of the Semaphore interface.
 */
public class SimpleSemaphore implements Semaphore {
    
    private int counter;

    /**
     * This Constructor creates an object of the Semaphore with transmitted number of permits.
     *
     * @param counter int available quantity of permits.
     */
    public SimpleSemaphore(int counter) {
        if (counter <= 0) throw new IllegalArgumentException("Permits' quantity should be more than \"0\" ");
        this.counter = counter;
    }

    /**
     * Requests permission. If there is a free permission, a thread captures it. If not -
     * suspends the thread until appearance a free permit.
     *
     * @throws InterruptedException
     */
    @Override
    public synchronized void acquire() throws InterruptedException {
        while (counter == 0) {
            this.wait();
        }
        counter--;
    }

    /**
     * Requests transmitted number of permits. If there are such permits' quantity, threads capture it.
     * If not - suspends threads until appearance transmitted number of permits.
     *
     * @param permits int necessary quantity of permits.
     * @throws InterruptedException
     */
    @Override
    public synchronized void acquire(int permits) throws InterruptedException {
        while (counter < permits) {
            this.wait();
        }
        counter -= permits;
    }

    /**
     * Frees a permit, returning it to the semaphore.
     * Notifies one thread about freed permit.
     */
    @Override
    public synchronized void release() {
        if (counter == 0) {
            this.notify();
        }
        counter++;
    }

    /**
     * Frees transmitted quantity of permits, returning it to the semaphore.
     * Notifies all threads about freed permits.
     *
     * @param permits int necessary quantity of permits to free.
     */
    @Override
    public synchronized void release(int permits) {
        if (counter == 0) {
            this.notifyAll();
        }
        counter += permits;
    }

    /**
     * Returns available number of permits.
     *
     * @return int number of available permits.
     */
    @Override
    public synchronized int getAvailablePermits() {
        return counter;
    }
}
