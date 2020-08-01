package com.anggastudio.kotlinandroiddasarprep

class UserDummy {

    companion object {
        fun getUserList(): ArrayList<User> {
            val userList = arrayListOf<User>()
            userList.add(User("angga", "123", "Angga Pratama", "aa.angga.pratama@gmail.com"))
            userList.add(User("otong", "1234", "Oscar Tonggeret", "aa.otong@gmail.com"))
            userList.add(User("panjul", "12345", "Panthera Julius", "aa.panjul@gmail.com"))
            return userList
        }
    }
}