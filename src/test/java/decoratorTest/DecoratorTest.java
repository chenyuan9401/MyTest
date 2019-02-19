package decoratorTest;

import com.decorator.testone.Component.Inter.Component;
import com.decorator.testone.Component.Inter.impl.ConComponent;
import com.decorator.testone.Component.Inter.impl.decoratorImpl.ClothesDecorator;
import com.decorator.testone.Component.Inter.impl.decoratorImpl.PantsDecorator;
import com.decorator.testone.Component.Inter.impl.decoratorImpl.ShoesDecorator;

public class DecoratorTest {
	public static void main(String[] args) {

		Component component = new ConComponent();
		Component showComponent = new ShoesDecorator(component);
		Component pantsComponent = new PantsDecorator(showComponent);
		Component clothesComponent = new ClothesDecorator(pantsComponent);
		clothesComponent.operator();
	}
}
