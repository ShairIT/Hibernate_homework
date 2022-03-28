package peaksost;

import org.hibernate.Session;
import org.hibernate.query.Query;
import peaksost.entity.*;
import peaksost.util.HibernateUtil;

import java.util.List;


public class App {

    public static void main(String[] args) {

       HibernateUtil.getSessionFactory();

       Animal animal = new Animal("Bereke", "grey", 4, "Alabay");
        create(animal);
        // System.out.println(getById(1));
       // update( 3,"Sharik", "white", 3, "Aktosh");
       // getAllAnimal();
        // delete(1);
       // deleteAll();


       Cars cars = new Cars("TOYOTA", "RAV4", 10000, "Japan", 1);
         create(cars);
        // System.out.println(getByIdCars(1));
       // updateCars(3, "VOLVO", "XC90", 12000, "Sweden", 2);
       // getAllCars();
       // deleteCars(1);
       // deleteAllCars();

       Country country = new Country("Kyrgyz", "Bishkek", 7, 6580000, "warm");
        createCountry(country);
        // System.out.println(getByIdCountry(1));
       // updateCountry(1, "Russian", "Moscow", 85, 145478097, "wet");
       // getAllCountry();
       // deleteCountry(2);
        // deleteAllCountry();

       Culture culture = new Culture("education", "civilization", "ethical", "economic", "political");
        createCulture(culture);
        // System.out.println(getByIdCulture(1));
        // updateCulture(1, "education1", "civilization1", "ethical1", "economical1", "political1");
       // getAllCulture();
      //  deleteCulture(2);
        // deleteAllCulture();

       Fruits fruits = new Fruits("mandarin and pomelo", "orange", "circle", "fresh", "allSeason");
        createFruits(fruits);
        // System.out.println(getByIdFruits(1));
       // updateFruits(1, "tomato and limon", "lemato", "circular", "fresh", "Autumn");
       // getAllFruits();
       // deleteFruits(2);
       // deleteAllFruits();

       House house = new House(4, 5, "Mady", 6, "Uzgenskaya");
        createHouse(house);
        // System.out.println(getByIdHouse(1));
       // updateHouse(1, 3, 4, "Madygrad", 5, "Oshskaya");
       // getAllHouse();
      //  deleteHouse(2);
      //  deleteAllHouse();

       Person person = new Person("Oleg", "Tinkoff", "Olegovich", 40, "office");
       createPerson(person);
        // System.out.println(getByIdPerson(1));
       // updatePerson(1, "Ivan", "Ivanov", "Ivanovich", 20, "shop");
       // getAllPerson();
       // deletePerson(2);
       // deleteAllPerson();

       Products products = new Products("bread", "Miratorg", 2022/03/03, 2, "Russian");
        createProducts(products);
       // System.out.println(getByIdProducts(1));
       // updateProducts(1, "milk", "Prostakvashino", 2022/03/20, 3, "Russian");
       // getAllProducts();
       // deleteProducts(2);
       // deleteAllProducts();

       Rivers rivers = new Rivers("Naryn", 807, "Naryn", 59, 40);
        createRivers(rivers);
        // System.out.println(getByIdRivers(1));
       // updateRivers(1, "Moscow", 473, "Moscow-Smolensk", 17600, 65);
      // getAllRivers();
      //  deleteRivers(2);
       // deleteAllRivers();

       School school = new School(1500, 1, "Ivanova", "English", "Moskovskaya 14");
        createSchool(school);
        // System.out.println(getByIdSchool(1));
       // updateSchool(1, 1000, 45, "Semenova", "maths", "Polyanka 15");
       // getAllSchool();
       // deleteSchool(2);
       // deleteAllSchool();
    }


    public static int create(Animal animal) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(animal);
        session.getTransaction();
        session.close();
        System.out.println("Added successfully " + animal);
        return animal.getId();
    }

    public static List<Animal> getAllAnimal(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Animal> animal = session.createQuery("FROM Animal").getResultList();
        session.getTransaction().commit();
        session.close();
        System.out.println("Finded " + animal.size() + " animal");
        return animal;
    }

    public static void update(int id, String name, String colour, int weight, String breed){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Animal animal = session.get(Animal.class, id);
        animal.setName(name);
        animal.setBreed(breed);
        animal.setColour(colour);
        animal.setWeight(weight);
        session.getTransaction().commit();
        System.out.println("Successfully updated");
        session.close();
    }

    public static void delete(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Animal animal = session.get(Animal.class, id);
        session.delete(animal);
        session.getTransaction().commit();
        System.out.println("Succesfully deleted");
        session.close();

    }

    public static void deleteAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("DELETE FROM Animal");
        query.executeUpdate();
        session.getTransaction().commit();
        System.out.println("Succesfully deleted all datas in Animal");
        session.close();
    }

    public static Animal getById(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Animal animal = session.get(Animal.class, id);
        session.getTransaction().commit();
        session.close();
        return animal;
    }

    //CARS
    public static int create(Cars cars){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(cars);
        session.getTransaction().commit();
        session.close();
        System.out.println("Added successfully " + cars);
        return cars.getId();
    }

    public static List<Cars> getAllCars(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Cars> cars = session.createQuery("FROM Cars").getResultList();
        session.getTransaction().commit();
        session.close();
        System.out.println("Finded " + cars.size() + " cars");
        return cars;
    }

    public static void updateCars(int id, String mark, String model, int price, String production, int owner){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Cars cars = session.get(Cars.class, id);
        cars.setMark(mark);
        cars.setModel(model);
        cars.setPrice(price);
        cars.setProduction(production);
        cars.setOwner(owner);
        session.beginTransaction();
        System.out.println("Successfully updated");
        session.close();
    }

    public static void deleteCars(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Cars cars = session.get(Cars.class, id);
        session.delete(cars);
        session.getTransaction().commit();
        System.out.println("Successfully deleted");
        session.close();
    }

    public static void deleteAllCars(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("DELETE FROM Cars");
        query.executeUpdate();
        session.getTransaction().commit();
        System.out.println("Succesfully deleted all datas in Animal");
        session.close();
    }

    public static Cars getByIdCars(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Cars cars = session.get(Cars.class, id);
        session.getTransaction().commit();
        session.close();
        return cars;
    }

    public static int createCountry(Country country){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(country);
        session.getTransaction().commit();
        session.close();
        System.out.println("Added succesfully " + country);
        return country.getId();
    }

    public static List<Country> getAllCountry(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Country> countries = session.createQuery("FROM Country").getResultList();
        session.getTransaction().commit();
        session.close();
        System.out.println("Finded" + countries.size() + "students");
        return countries;
    }

    public static void updateCountry(int id, String nation, String capital, int region, int population, String clime){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Country country = session.get(Country.class, id);
        country.setNation(nation);
        country.setCapital(capital);
        country.setRegion(region);
        country.setPopulation(population);
        country.setClime(clime);
        session.getTransaction().commit();
        System.out.println("Country is successfully updated");
        session.close();
    }

    public static void deleteCountry(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Country country = session.get(Country.class, id);
        session.delete(country);
        session.getTransaction().commit();
        System.out.println("Country is succesfully deleted");
        session.close();
    }

    public static void deleteAllCountry(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("DELETE FROM Country");
        query.executeUpdate();
        session.getTransaction().commit();
        System.out.println("Successfully deleted all datas in Country");
        session.close();
    }

    public static Country getByIdCountry(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Country country = session.get(Country.class, id);
        session.getTransaction().commit();
        session.close();
        return country;
    }

    public static int createCulture(Culture culture){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(culture);
        session.getTransaction().commit();
        session.close();
        System.out.println("Culture is successfully created");
        return culture.getId();
    }

    public static List<Culture> getAllCulture(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Culture> cultures = session.createQuery("FROM Culture").getResultList();
        session.beginTransaction().commit();
        session.close();
        System.out.println("Finded" + cultures.size() + "cultures");
        return cultures;
    }

    public static void updateCulture(int id, String education, String civilization, String ethical, String economic, String political){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Culture cultures = session.get(Culture.class, id);
        cultures.setEducation(education);
        cultures.setCivilization(civilization);
        cultures.setEthical(ethical);
        cultures.setEconomic(economic);
        cultures.setPolitical(political);
        session.getTransaction().commit();
        System.out.println("Culture is successfully updated");
        session.close();
    }

    public static void deleteCulture(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Culture cultures = session.get(Culture.class, id);
        session.delete(cultures);
        session.getTransaction().commit();
        System.out.println("Successfully deleted " + cultures);
        session.close();
    }

    public static void deleteAllCulture(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("DELETE FROM Culture");
        query.executeUpdate();
        session.getTransaction().commit();
        System.out.println("Successfully deleted all datas in Culture");
        session.close();
    }

    public static Culture getByIdCulture(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Culture cultures = session.get(Culture.class, id);
        session.getTransaction().commit();
        session.close();
        return cultures;
    }

    public static int createFruits(Fruits fruits){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(fruits);
        session.getTransaction().commit();
        session.close();
        System.out.println("Fruits is successfully created");
        return fruits.getId();
    }

    public static List<Fruits> getAllFruits(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Fruits> fruits = session.createQuery("FROM Fruits ").getResultList();
        session.getTransaction().commit();
        session.close();
        System.out.println("Finded" + fruits.size() + "fruits");
        return fruits;
    }

    public static void updateFruits(int id, String hybrid, String sort, String form, String quality, String seasonal){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Fruits fruits = session.get(Fruits.class, id);
        fruits.setHybrid(hybrid);
        fruits.setSort(sort);
        fruits.setForm(form);
        fruits.setQuality(quality);
        fruits.setSeasonal(seasonal);
        session.getTransaction().commit();
        System.out.println("Fruits is successfully updated");
        session.close();
    }

    public static void deleteFruits(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Fruits fruits = session.get(Fruits.class, id);
        session.delete(fruits);
        session.getTransaction().commit();
        System.out.println("Successfully deleted " + fruits);
        session.close();
    }

    public static void deleteAllFruits(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("DELETE FROM Fruits");
        query.executeUpdate();
        session.getTransaction().commit();
        System.out.println("Successfully deleted all datas in Fruits");
        session.close();
    }

    public static Fruits getByIdFruits(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Fruits fruits = session.get(Fruits.class, id);
        session.getTransaction().commit();
        session.close();
        return fruits;
    }

    public static int createHouse(House house){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(house);
        session.getTransaction().commit();
        session.close();
        System.out.println("House is succesfully created");
        return house.getId();
    }

    public static List<House> getAllHouse(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<House> houses = session.createQuery("FROM House ").getResultList();
        session.getTransaction().commit();
        session.close();
        System.out.println("Finded" + houses.size() + houses);
        return houses;
    }

    public static void updateHouse(int id, int rooms, int floor, String village, int human, String street){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        House house = session.get(House.class, id);
        house.setRooms(rooms);
        house.setFloor(floor);
        house.setVillage(village);
        house.setHuman(human);
        house.setStreet(street);
        session.getTransaction().commit();
        System.out.println("Successfully updated");
        session.close();
    }

    public static void deleteHouse(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        House house = session.get(House.class, id);
        session.delete(house);
        session.getTransaction().commit();
        System.out.println("Successfully deleted" + house);
        session.close();
    }

    public static void deleteAllHouse(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("DELETE FROM House");
        query.executeUpdate();
        session.getTransaction().commit();
        System.out.println("Successfully deleted all datas in House");
        session.close();
    }

    public static House getByIdHouse(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        House house = session.get(House.class, id);
        session.getTransaction().commit();
        session.close();
        return house;
    }

    public static int createPerson(Person person){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();
        session.close();
        System.out.println("Person is successfully created");
        return person.getId();
    }

    public static List<Person> getAllPerson(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Person> person = session.createQuery("FROM Person").getResultList();
        session.getTransaction();
        session.close();
        System.out.println("Finded" + person.size() + "person");
        return person;
    }

    public static void updatePerson(int id, String username, String surname, String lastname, int age, String departament){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Person person = session.get(Person.class, id);
        person.setUsername(username);
        person.setSurname(surname);
        person.setLastname(lastname);
        person.setAge(age);
        person.setDepartament(departament);
        session.getTransaction().commit();
        System.out.println("Person is successfully updated");
        session.close();
    }

    public static void deletePerson(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Person person = session.get(Person.class, id);
        session.delete(person);
        session.getTransaction().commit();
        System.out.println("Successfully deleted" + person);
        session.close();
    }

    public static void deleteAllPerson(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("DELETE FROM Person");
        query.executeUpdate();
        session.getTransaction().commit();
        System.out.println("Successfully deleted all datas in Person");
        session.close();
    }

    public static Person getByIdPerson(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Person person = session.get(Person.class, id);
        session.getTransaction().commit();
        session.close();
        return person;
    }

    public static int createProducts(Products products){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(products);
        session.getTransaction().commit();
        session.close();
        System.out.println("Products is successfully created" + products);
        return products.getId();
    }

    public static List<Products> getAllProducts(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Products> products = session.createQuery("FROM Products").getResultList();
        session.getTransaction().commit();
        session.close();
        System.out.println("Finded" + products.size() + "products");
        return products;
    }

    public static void updateProducts(int id, String type, String brand, int date, int face, String country){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Products products = session.get(Products.class, id);
        products.setType(type);
        products.setBrand(brand);
        products.setDate(date);
        products.setFaces(face);
        products.setCountry(country);
        session.getTransaction().commit();
        System.out.println("Products is successfully updated");
        session.close();
    }

    public static void deleteProducts(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Products products = session.get(Products.class, id);
        session.delete(products);
        session.getTransaction().commit();
        System.out.println("Successfully deleted" + products);
        session.close();
    }

    public static void deleteAllProducts(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("DELETE FROM Products");
        query.executeUpdate();
        session.getTransaction().commit();
        System.out.println("Successfully deleted all datas in Products");
        session.close();
    }

    public static Products getByIdProducts(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Products products = session.get(Products.class, id);
        session.getTransaction().commit();
        session.close();
        return products;
    }

    public static int createRivers(Rivers rivers){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(rivers);
        session.getTransaction().commit();
        session.close();
        System.out.println("Added successfully" + rivers);
        return rivers.getId();
    }

    public static List<Rivers> getAllRivers(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Rivers> rivers = session.createQuery("FROM Rivers").getResultList();
        session.getTransaction().commit();
        session.close();
        System.out.println("Finded" + rivers.size() + "rivers");
        return rivers;
    }

    public static void updateRivers(int id, String title, int length, String town, int volume, int wight){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Rivers rivers = session.get(Rivers.class, id);
        rivers.setTitle(title);
        rivers.setLength(length);
        rivers.setTown(town);
        rivers.setVolume(volume);
        rivers.setWidth(wight);
        session.getTransaction().commit();
        System.out.println("Rivers is successfully updated");
        session.close();
    }

    public static void deleteRivers(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Rivers rivers = session.get(Rivers.class, id);
        session.delete(rivers);
        session.getTransaction().commit();
        System.out.println("successfully deleted" + rivers);
        session.close();
    }

    public static void deleteAllRivers(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("DELETE FROM Rivers");
        query.executeUpdate();
        session.getTransaction().commit();
        System.out.println("Successfully deleted all datas in Rivers");
        session.close();
    }

    public static Rivers getByIdRivers(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Rivers rivers = session.get(Rivers.class, id);
        session.getTransaction().commit();
        session.close();
        return rivers;
    }

    public static int createSchool(School school){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(school);
        session.getTransaction().commit();
        session.close();
        System.out.println("School is successfully created");
        return school.getId();
    }

    public static List<School> getAllSchool(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<School> schools = session.createQuery("FROM School").getResultList();
        session.getTransaction().commit();
        session.close();
        System.out.println("Finded" + schools.size() + "schools");
        return schools;
    }

    public static void updateSchool(int id, int pupil, int teachers, String director, String classroom, String address){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        School school = session.get(School.class, id);
        school.setPupils(pupil);
        school.setTeachers(teachers);
        school.setDirector(director);
        school.setClassrooms(classroom);
        school.setAddress(address);
        session.getTransaction().commit();
        session.close();
        System.out.println("School is successfully updated");
    }

    public static void deleteSchool(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        School school = session.get(School.class, id);
        session.delete(school);
        session.getTransaction().commit();
        System.out.println("successfully deleted" + school);
        session.close();
    }

    public static void deleteAllSchool(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("DELETE FROM School");
        query.executeUpdate();
        session.getTransaction().commit();
        System.out.println("Successfully deleted all datas in School");
        session.close();
    }

    public static School getByIdSchool(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        School school = session.get(School.class, id);
        session.getTransaction().commit();
        session.close();
        return school;
    }





























}
