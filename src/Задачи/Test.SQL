
CREATE TABLE db.location (
loc_id int,
loc_name varchar(100),
pos varchar(10));

CREATE TABLE db.employee (
emp_id int,
loc_id int,
salary numeric(10,2),
group_id int,
b_dt date);

                        -- Вывести всех сотрудников emp_id с локации Водный (loc_name = ‘Водный’).
                                      -- В выводе должно быть emp_id, loc_name, group_id.


--JOIN
SELECT e.emp_id, l.loc_name, e.group_id
from employee as e join location as l
ON e.loc_id = l.loc_id
where l.loc_name = 'Водный' ;

--вложенный
select emp_id, loc_name, group_id
from(
select  e.emp_id, l.loc_name, e.group_id
from employee as e join location as l
ON e.loc_id = l.loc_id
)
where loc_name = 'Водный';

                        --Вывести кол-во сотрудников в каждой из локаций, где сотрудников больше 3.
                                --В выводе должно быть: loc_id, loc_name, кол-во сотрудников

--JOIN
SELECT l.loc_id, l.loc_name, count (e.emp_id) as count_emp
FROM employee as e join location as l
on e.loc_id = l.loc_id
group by l.loc_id, l.loc_name
having count_emp>3

--вложенный
SELECT loc_id, loc_name, count_emp
from (
select l.loc_id, l.loc_name, count(e.emp_id) as count_emp
from employee as e join location as l
on e.loc_id = l.loc_id
group by l.loc_id, l.loc_name
)
where count_emp>3

                         --Вывести вторую минимальную зарплату в организации по каждому отделу (group_id) среди всех сотрудников.
                                                     --В выводе должно быть: group_id, salary











private LoginResult GetUser(String c, String l, String p) {       //название метода с маленькой буквы
                                                                  //назвать входные параметры нормальными именами: login, password и т.д
                                                                  //расположить эти параметры в порядке их вызова

 AuthUser user = new AuthUser();
 user.setLogin(l);               //заполняет user данными логина, пароля и т.д.
 user.setPassword(p);
 user.setAppCode(c);
 //можно вынести заполнение этих полей в отдельный метод класса AuthUser
 //можно добавить проверки входных параметров:
  if (login == null) {
         throw new IllegalArgumentException("login cannot be null or empty");
     }

 return UserService.login(user);       //предполагается, что мы уверены, что этот метод возвращает тип LoginResult
 }


  LoginResult result = GetUser(APP, UserLogin, UserPassword);
  assertEquals(result.getStatus(), LoginResult.Status.OK);   //сначала идет expected, потом actual, поэтому сначала идет LoginResult.Status.OK, а потом result.getStatus()
  //LoginResult.Status.OK - есть класс LoginResult, в нем есть вложенный класс Status

  Assert.assertFalse(isBlank(result.getData()));             //можно импортировать статический assertFalse для приведения к общему виду
  UserDto user = result.getUser();
  if (user.getPermissions().isAdmin() == true)
  assertNotNull(result.getData().getComponents());
  }




--другое задание Тинькова

//Проверяет что длина пароля больше значения CRITICAL_LENGTH
public static void checkLength(String pw){
if(pw.length()>CRIRICAL_LENGTH){
System.out.println ("Длина превышает")}
}
}

//Проверяет что длина пароля больше значения CRITICAL_LENGTH
public boolean isPasswordLengthValid(String password, int critical_length) {
    if (password == null) {
        return false; // или выбросить исключение, если нужно
    }
    return password.length() <= critical_length;
}

}







