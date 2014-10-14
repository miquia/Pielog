#Pielog

Think of this project as a "proof of concept" about the benefits of using design patterns, loose coupling, modular design, etc... It's all the things you always knew you should "use" but never had time to play around with and put into practice.

###Infusion Soft
The project uses [infusionsoft](https://developer.infusionsoft.com/docs) for email-marketing automation handled by
`infusion_helper.php` and `Infusion.php (library wrapper)`

In the views, you can declare a `data-infuse=""` attribute that holds the tag name (from `infusion_helper.php`) you want to assign. For Example:
`data-infuse="tools"` would assign the `general` tag
