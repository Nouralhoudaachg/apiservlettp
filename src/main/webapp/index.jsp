
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title> UI::FORM </title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/monstyle.css">
</head>


<body style= "font-family: Optima" class="mg20"><br>


  <p class="h4 bold gray"> Formulaire de satisfaction</p> <br>

<form name="form1" method="get" action="form">
    <p class="bold">
        Nom: <input type="text" name="nom">
        Prenom:<input> type="text" name="prenom">

    </p>
    <p>
        <span class="bold"> Sexe</span>
        <input type="radio" name="radio1" value="mas" checked> masculin
        <input type="radio" name="radio1" value="fem"> feminin
    </p>
    <p class="bold">Commentaire :<br>
        <textarea name="textarea"  cols="56" rows="10" class="gray" > </textarea>
        <br> <br>
       <input class="btn btn-success bold " type="submit" name="Submit" value="Soumettre">
    </p>
</form>

</body>
</html>
