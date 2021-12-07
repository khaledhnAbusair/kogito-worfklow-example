package com.progressoft.abusair;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDao implements IUserDao {
    Logger logger = LoggerFactory.getLogger(UserDao.class);

    @Autowired
    private UserRepository userRepository;


    @Override
    public void persist(User user) {
        logger.info("inside persist user");
        if (user == null) throw new NullArgumentException("user");
        user.setStatus("pending");
        userRepository.save(user);
    }

    @Override
    public void approveUser(User user) {
        logger.info("inside approve user");
        user.setStatus("approve");
        userRepository.save(user);
    }

    @Override
    public void checkerApproveUser(User user) {
        logger.info("inside checker approve user");
        user.setStatus("checkerApprove");
        userRepository.save(user);
    }

    @Override
    public void checkerRejectUser(User user) {
        logger.info("inside checker reject user");
        user.setStatus("checkerReject");
        userRepository.save(user);
    }

    @Override
    public void rejectUser(User user) {
        logger.info("inside reject user");
        user.setStatus("reject");
        userRepository.save(user);
    }

    @Override
    public void returnUser(User user) {
        logger.info("inside return user");
        user.setStatus("return");
        userRepository.save(user);
    }

    @Override
    public void checkerCancel(User user) {
        logger.info("inside cancel user");
        if (user == null) throw new NullArgumentException("user");
        user.setStatus("cancelled");
        userRepository.save(user);
    }


}
