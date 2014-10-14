#Pielog

Think of this project as a "proof of concept" about the benefits of using design patterns, loose coupling, modular design, etc... It's all the things you always knew you should "use" but never had time to play around with and put into practice.

###Infusion Soft
The project uses [infusionsoft](https://developer.infusionsoft.com/docs) for email-marketing automation handled by
`infusion_helper.php` and `Infusion.php (library wrapper)`

####the elements
In the views, the element(s) should have "infusionsoft" as a class and have a `data-infuse=""` attribute that holds the tag name (from `infusion_helper.php`) you want to assign to the User upon a form's submit. For Example:
```html
<a class="someclass infusionsoft" data-infuse="tools">
```
would assign `tools` tag to the infusionsoft contact.

####the form
Then, for the form you can add a hidden input element with `name="infusion_tag"` and call the `infuse()` jQuery plugin on it to make it listen to all the `data-infuse` elements on that page. For Example:
```html
<form action="user/register" method="post">
  <input type="text" name="first_name">
  <input type="text" name="last_name">
  <!-- Adding "infusion_tag"-->
  <input type="hidden" name="infusion_tag" value="">
  <!-- See script below -->
</form>
<script>
    $(document).ready(function(){
        $('input[name="infusion_tag"]').infuse();
    });
</script>
```
