package com.migdal.songCup.api;

import com.migdal.songCup.dao.entity.Song;
import com.migdal.songCup.menager.SongMenager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/songs")
public class SongApi {

    private SongMenager songMenager;

    @Autowired
    public SongApi(SongMenager songMenager) {
        this.songMenager = songMenager;
    }

    @GetMapping("/all")
    public Iterable<Song> getAll() {
        return songMenager.findAll();
    }

    @GetMapping
    public Optional<Song> getById(@RequestParam Long index) {
        return songMenager.findById(index);
    }

    @PostMapping
    public Song addSong(@RequestBody Song song) {
        return songMenager.save(song);
    }

    @PutMapping
    public Song updateSong(@RequestBody Song song) {
        return songMenager.save(song);
    }

    @DeleteMapping
    public void deleteSong(@RequestParam Long index) {
        songMenager.delete(index);
    }
}
