<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<title>Anket Sayfa 2</title>
		<style>
			body {
			  max-width: 500px;
			  margin: auto;
			  background: white;
			  padding: 20px;
			}
			.formElement{
			  width: 55%;
			  padding: 10px 20px;
			  margin: 4px 0;
			  box-sizing: border-box;
			  border: 2px solid DeepSkyBlue;
			  border-radius: 4px;
			}
		 .button {
			  background-color: #4CAF50; 
			  border: none;
			  color: white;
			  padding: 12px 24px;
			  text-align: center;
			  text-decoration: none;
			  display: inline-block;
			  font-size: 14px;
			  margin: 4px 2px;
			  transition-duration: 0.4s;
			  cursor: pointer;
			}
			
			
			
			.button2 {
			  background-color: white; 
			  color: black; 
			  border: 2px solid #008CBA;
			}
			
			.button2:hover {
			  background-color: #008CBA;
			  color: white;
			}
			.hata_mesaj{
				color:red;
			}
		</style>
	</head>
	<body>
	<form action="" method="GET">
		
		<label>Öğrenim Durumunuz : </label><br/>
		<select id="cars">
  <option value="volvo">Volvo</option>
  <option value="saab">Saab</option>
  <option value="mercedes">Mercedes</option>
  <option value="audi">Audi</option>
</select>
		
	<br/><br/>	<label>Çalıştığınız Sektör : </label><br/>
		 <input type="radio" id="male" name="gender" value="male">Erkek
	<input type="radio" id="male" name="gender" value="male">kadin
		
		<br/><label>Aylık Geliriniz : </label><br/>
			<select id="cars">
  <option value="volvo">Volvo</option>
  <option value="saab">Saab</option>
  <option value="mercedes">Mercedes</option>
  <option value="audi">Audi</option>
</select>
		
		
	<br/><br/>	<label>Kazancınızı En Çok Neye Harcıyorsunuz? : </label>
		 <input type="checkbox" id="vehicle1" name="vehicle1" value="Bike">
		  <input type="checkbox" id="vehiclee1" name="vehi3cle1" value="Bi3ke">
		
		
	<br/><br/>	<label>Boş Zamanlarınızı Nasıl Değerlendiriyorsunuz? : </label>
		 <input type="checkbox" id="vehifhgcle1" name="vehifgcle1" value="Bigfhjfke">
				<br/><input class="button button2" type="submit" value="Sonuçları Gönder" />
		
		</form>
	</body>
</html>
