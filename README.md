#Pielog

Think of this project as a "proof of concept" about the benefits of using design patterns, loose coupling, modular design, etc... It's all the things you always knew you should "use" but never had time to play around with and put into practice.

###Infusion Soft
The project uses [infusionsoft](https://developer.infusionsoft.com/docs) and their [PHP-iSDK](https://github.com/infusionsoft/PHP-iSDK) for email-marketing automation handled by
`infusion_helper.php` and `Infusion.php (library wrapper)`

####the elements
In the views, the element(s) should have "infusionsoft" as a class and have a `data-infuse=""` attribute that holds the tag name (from `infusion_helper.php`) you want to assign to the User upon a form's submit. For Example:
```html
<a class="someclass infusionsoft" data-infuse="tools">
```
would assign `tools` tag to the infusionsoft contact.
