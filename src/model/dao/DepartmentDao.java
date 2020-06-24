package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj); //Operacao responsavel por inserir no banco de dados esse objeto que eu enviar como paramentro de entrada.
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id); //Operacao responsavel por pegar o Id enviado como argumento e consultar no banco de dados o objeto com esse Id (retona o objeto consultado, que e do tipo Department). Se nao existir, retorna nulo
	List<Department> findAll(); //Operacao para retornar todo os departemtnos, por isso que e uma lista
}
