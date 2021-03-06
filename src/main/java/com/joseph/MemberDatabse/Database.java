package com.joseph.MemberDatabse;

import java.util.List;

public interface Database {

    //File handling
    void createFile(String path);
    List<Member> downloadFromFile();
    void writeMemberToFile(Member member, String filePath);
    void uploadToFile(List<Member> list, String filePath);
    void deleteFile(String path);

    //member handling
    void addMember(Member member);
    Member findMember(int id);
    void removeMember(int id);
}


