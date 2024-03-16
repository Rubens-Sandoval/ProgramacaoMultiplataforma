package refactoring_guru.abstract_factory.example.factories;

import refactoring_guru.abstract_factory.example.buttons.Button;
import refactoring_guru.abstract_factory.example.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */

 // Create a interface to define the necessary methods of the Factories classes
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}