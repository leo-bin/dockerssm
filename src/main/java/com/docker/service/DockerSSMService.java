package com.docker.service;

import com.docker.dao.DockerSSMDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author leo-bin
 * @date 2019/10/24 15:25
 * @apiNote
 */
@Service
public class DockerSSMService {

    @Autowired
    private DockerSSMDAO dockerSSMDAO;

    public void insert(){
        dockerSSMDAO.insert();
    }
}
