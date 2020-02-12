package com.grailsinaction
class User {
    String loginId
    String password
    String homepage
    Date dateCreated
    static hasOne = [ profile : Profile ]
    static hasMany = [ posts : Post, tags : Tag, following : User ]
    static constraints = {
        loginId size: 3..20, unique: true, blank: false
        password size: 6..8, blank: false, validator: { passwd, user ->
            passwd != user.loginId
        }
        homepage nullable: true
        profile nullable: true
    }
    static mapping = {
        posts sort:'dateCreated'
    }

//    static constraints = {
//        loginId matches: '[0-9]{7}[A-Za-z]'
//    }
}