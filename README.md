📘 CountriesRegions_Hibernate

A simple Hibernate-based Maven project to perform CRUD operations on countries and regions tables using Hibernate Native API and PostgreSQL.

✅ Features
1)Add new Regions and Countries
2)View all Regions and Countries
3)Update existing Region/Country
4)Delete Region and Country
5)Automatic timestamp recording (createdDate, createdTime)

Clean and formatted console output

🧑‍💻 Technologies Used
1)Java
2)Hibernate Final
3)PostgreSQL	
4)Jakarta Persistence	3.1.0
5)Maven	Project Manager
6)Log4j	For Logging
7)Eclipse IDE	for Development

⚙️ Prerequisites
*JDK 17 or above
*PostgreSQL installed and running
*A PostgreSQL database named: hibernate_crud
*Maven installed
*Eclipse or any Java IDE

🗃️ Database Schema
🔹 regions table
Column Name	Data Type
region_id	Integer (PK)
region_name	VARCHAR
created_at	TIMESTAMP

🔹 countries table
Column Name	Data Type
country_id	VARCHAR (PK)
country_name	VARCHAR
region_id	Integer (FK)
created_date	DATE
created_time	TIME

📂 Project Structure
CountriesRegions_Hibernate/
│
├── src/
│   └── main/
│       └── java/
│           ├── config/
│           │   └── HibernateUtil.java
│           ├── dao/
│           │   ├── CountryDAO.java
│           │   └── RegionDAO.java
│           ├── model/
│           │   ├── Country.java
│           │   └── Region.java
│           └── Main.java
├── resources/
│├── hibernate.cfg.xml
│└── log4j.properties
├── pom.xml
└── README.md


---

## 🚀 How to Run?

1. Clone this repository  
2. Ensure your PostgreSQL database `hibernate_crud` is up and running with the required tables  
3. Configure your database connection in `hibernate.cfg.xml`  
4. Use Maven to build the project
5. Run the 'Main.java' class from your IDE or command line  

---

## 📞 Contact:

For any queries, please contact:

- Name: Sukanya Govardhan Wagh  
- Email: [waghsukanya153@gmail.com]  

---

*Happy Coding!* 🚀

## Output Screenshot

<img width="735" height="547" alt="Image" src="https://github.com/user-attachments/assets/6893c818-f369-4310-b904-cd99edc64691" />
