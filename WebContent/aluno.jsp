<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de Alunos</title>
</head>
<body>

	<h2 style="color: black; font-family: calibri;">Registro de Aluno</h2> 
	
	<form method="POST" action="./CtrAluno">
	<fieldset style="width: 300px;"><legend style="font-family:helvetica; font-size: 14px;">Gestão de Aluno</legend>
	<table border="0">
		<tr>
			<td colspan="1" style="font-family: calibri;">ID:</td>
			<td colspan="1"><input type="text" name="id"></td>
		</tr>
		<tr>
			<td colspan="1" style="font-family: calibri;">RA:</td>
			<td colspan="1"><input type="text" name="ra"></td>
		</tr>
		<tr>
			<td colspan="1" style="font-family: calibri;">Nome:</td>
			<td colspan="1"><input type="text" name="nome"></td>		
		</tr>
		<tr>
			<td colspan="1" style="font-family: calibri;">Idade:</td>
			<td colspan="1"><input type="text" name="idade"></td>		
		</tr>
		<tr>
			<td colspan="1" style="font-family: calibri;">Sexo:</td>
			<td colspan="1">
				<select name="sexo">
					<option value="feminino">Feminino</option>
					<option value="masculino" >Masculino</option>
					<option value="outros">Outros...</option>
				</select>
		</tr>
		<tr>
			<td colspan="1"><br><input type="submit" name="cmd" value="Adicionar" /></td>
			<td colspan="1"><br><input type="submit" name="cmd" value="Atualizar"/></td>
		<tr>	
			<td colspan="1"><input type="submit" name="cmd" value="Pesquisar"/></td>
			<td colspan="1"><input type="submit" name="cmd" value="Remover"/></td>
		</tr>
	</table>
	</fieldset>
	</form>

</body>
</html>