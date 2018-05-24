package testRepositories;

import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import repositories.ItemRepository;

import domain.Item;
@ContextConfiguration(locations={"classpath:spring/datasource.xml",
		"classpath:spring/config/packages.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class ItemRepositoryTest {
	
	@Autowired 
	private ItemRepository itemRepo;
	
	@Test
	public void itemsByAscendingPriceTest(){
		Collection<Item> items;
		items = itemRepo.itemsByAscendingPrice();
		System.out.println("Price in ascending order");
		for(Item i: items){
			System.out.println(i.getId()+", "+i.getName()+", "+i.getPrice());
		}
		
	}
	@Test
	public void tagsFromCodItemTest(){
		String code="100234ag-taq31";
		Collection<String> tags= itemRepo.tagsFromCodItem(code);
		System.out.println("Tags from item whith code "+code);
		System.out.println(tags);
	}
}
