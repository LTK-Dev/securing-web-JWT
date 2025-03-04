# SpringBoot JWT Project

Name: Le Tuan Kiet  
StudentID: 22024546

## User
### Create new user POST /auth/user
![create_user.png](src/main/resources/img/adduser.png)
### Generate user's token POST /auth/token/
![get_user_token.png](src/main/resources/img/usertoken.png)
### Get users' profile through token GET /auth/user/profile
![get_user_profile.png](src/main/resources/img/userlogin.png)

### User CAN access GET /auth/accounts
![get_user_profile.png](src/main/resources/img/userall.png)

### User CAN NOT access PUT /auth/accounts/{id}
![get_user_profile.png](src/main/resources/img/userupdate.png)

### User CAN NOT access DEL /auth/accounts/{id}
![get_user_profile.png](src/main/resources/img/userdel.png)

## Admin
### Create new admin POST /auth/user
![create_user.png](src/main/resources/img/addadmin.png)
### Generate admin's token POST /auth/token/
![get_user_token.png](src/main/resources/img/admintoken.png)
### Get admin's profile through token GET /auth/admin/profile
![get_user_profilse.png](src/main/resources/img/adminlogin.png)

### ADMIN CAN access GET /auth/accounts
![get_user_profile.png](src/main/resources/img/adminall.png)

### ADMIN CAN access PUT /auth/accounts/{id}
![get_user_profile.png](src/main/resources/img/adminupdate.png)
![get_user_profile.png](src/main/resources/img/check.png)
![get_user_profile.png](src/main/resources/img/db.png)
![get_user_profile.png](src/main/resources/img/dbcheck.png)

### ADMIN CAN access DEL /auth/accounts/{id}
![get_user_profile.png](src/main/resources/img/admindel.png)

## Database
![db.png](src/main/resources/img/db.png)

