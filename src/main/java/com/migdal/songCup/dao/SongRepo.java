package com.migdal.songCup.dao;

import com.migdal.songCup.dao.entity.Song;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepo extends CrudRepository<Song, Long> {
}
