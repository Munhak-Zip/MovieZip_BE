package com.example.moviezip.service;

import com.example.moviezip.domain.Interest;
import com.example.moviezip.domain.Movie;
import com.example.moviezip.domain.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    public void updatePassword(Long id, String newPassword);
    public void updateNickname(Long id, String newNickname);

    public void deleteUser(Long id);

    public List<Movie> searchMoviesByTitle(String keyword);

    public void signup(User user);

    User getUserById(String id);

    User findByUserId(String userId);

    //회원가입
    ResponseEntity<String> joinProcess(User user);

    Long getIdByUsername(String username);

    void addInterest(Long id, String genre);

    User getUserById2(Long id);

    Interest ffindInterest(Long id);
}
