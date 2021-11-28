package com.abajuratelier.weather;
// Класс сингелтон для сохранения состояния активити
public class Presenter {
    //Внутреннее поле, будет хранить единственный экземпляр
    private static Presenter instance = null ;
    // Поле для синхронизации
    private static final Object syncObj = new Object();
    // Это наша тмпература
    private int tempemperature;
    // Конструктор (вызывать извне его нельзя, поэтому он приватный)
    private Presenter(){
        tempemperature = 0 ;
    }
    // Увеличение температуры
    public void incrementTempreche(){
        tempemperature ++;
    }

    public int getCounter(){
        return tempemperature;
    }
    // Метод, который возвращает экземпляр объекта.
// Если объекта нет, то создаем его.
    public static Presenter getInstance(){
// Здесь реализована «ленивая» инициализация объекта,
// то есть, пока объект не нужен, не создаем его.
        synchronized ( syncObj ) {
            if ( instance == null ) {
                instance = new Presenter();
            }
            return instance ;
        }
    }







}
