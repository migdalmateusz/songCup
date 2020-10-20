package com.migdal.songCup.menager;

import com.migdal.songCup.dao.SongRepo;
import com.migdal.songCup.dao.entity.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SongMenager {

    private SongRepo songRepo;

    @Autowired
    public SongMenager(SongRepo songRepo) {
        this.songRepo = songRepo;
    }

    public Optional<Song> findById (Long id) {
        return songRepo.findById(id);
    }

    public Iterable<Song> findAll () {
        return songRepo.findAll();
    }

    public Song save (Song song) {
        return songRepo.save(song);
    }

    public void delete (Long id) {
        songRepo.deleteById(id);
    }
}
