package com.ozerian.enterprise.module3_1.interfaces;

/**
 * Interface for Semaphore implementations.
 */
public interface Semaphore {

    /**
     * Requests permission. If there is a free permission, a thread captures it. If not -
     * suspends the thread until appearance a free permit.
     * @throws InterruptedException
     */
    void acquire() throws InterruptedException;

    /**
     * Requests transmitted number of permits. If there are such permits' quantity, threads capture it.
     * If not - suspends threads until appearance transmitted number of permits.
     * @param permits int necessary quantity of permits.
     * @throws InterruptedException
     */
    void acquire(int permits) throws InterruptedException;

    /**
     * Frees a permit, returning it to the semaphore.
     */
    void release();

    /**
     * Frees transmitted quantity of permits, returning it to the semaphore.
     * @param permits int necessary quantity of permits to free.
     */
   void release(int permits);

    /**
     * Returns available number of permits.
     * @return int number of available permits.
     */
    int getAvailablePermits();

}
