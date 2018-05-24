package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import domain.Item;
import repositories.ItemRepository;

@Service
@Transactional
public class ItemService {
	//	Managed repository -----------------------------------------
	
	@Autowired
	private ItemRepository itemRepository;
	
	//	Supporting services ----------------------------------------

	//	Constructor ------------------------------------------------
	
	//	Simple CRUD methods ----------------------------------------
	
	public Item create(){
		
	}
	
	public Collection<Item> findAll(){
		
	}
	
	public Item findOne(int itemId){
		
	}
	
	public void save(Item item){
		
	}
	
	public void delete(Item item){
		
	}
	
	//	Other business methods -------------------------------------
}
