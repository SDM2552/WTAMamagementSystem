package izo.wtamanagementsystem.service;

import izo.wtamanagementsystem.model.User;
import izo.wtamanagementsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User login(String username, String password) {
        // 데이터베이스에서 사용자를 검색합니다.
        User user = userRepository.findByUsername(username);
        // 평문 비밀번호 확인
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public void saveUser(User user) {
        // 비밀번호 암호화 없이 저장
        userRepository.save(user);
    }
}


///////////////////시큐리티활용코드
//package izo.wtamanagementsystem.service;
//
//import izo.wtamanagementsystem.model.User;
//import izo.wtamanagementsystem.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;  // 스프링 시큐리티의 비밀번호 암호화 도구
//
//    public User login(String username, String password) {
//        // 데이터베이스에서 사용자를 검색합니다.
//        User user = userRepository.findByUsername(username);
//        // 비밀번호 확인: 데이터베이스의 비밀번호는 암호화되어 저장되므로, 입력된 비밀번호를 암호화하여 비교합니다.
//        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
//            return user;
//        }
//        return null;
//    }
//
//    public void saveUser(User user) {
//        // 비밀번호를 암호화하여 저장
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        userRepository.save(user);
//    }
//}