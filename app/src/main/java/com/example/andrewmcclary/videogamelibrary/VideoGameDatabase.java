package com.example.andrewmcclary.videogamelibrary;

@Database(version = 1, entities = VideoGameDatabase.class)
@TypeConverters(DataConverter.class)

public abstract class VideoGameDatabase extends RoomDataBase{

    public abstract VideoGameDao videoGameDao();


}
