'use strict';
var shoppingList = new Array();
shoppingList = ['Chips', 'Cola', 'Olives', 'Café', 'Pommes'];
for (var i = 0; i < shoppingList.length; i++) {
  shoppingList[i] = shoppingList[i].toUpperCase();
}
/**
	Fonctions d'édition
 **/

// ajouter un produit dans la liste
function addItem() {
  var item = window.prompt("Entrez le nom de votre produit");
  item = item.toUpperCase();
  shoppingList.push(item);
  displayList();
}

// efface un élément de la liste s'il à été trouvé avec indexOf
function removeItem(itemName) {
  // on recherche dans un élément dans le tableau
  var index = shoppingList.indexOf(itemName);

  if (index == -1) {
    console.log("l'élément " + itemName + " est introuvable");
    return;
  }

  shoppingList.splice(index, 1);
  console.log("l'élément " + itemName + " a été supprimé");
  showTotalItems();
  displayList();
}

/**
	Fonctions d'affichage
**/

// alias de la fonction displayList()
function showList() {
  displayList();
}

// fonction qui affiche la liste des courses
function displayList() {
  console.clear();
  var divSuperList = document.getElementById('superList');
  showTotalItems();
  console.log(shoppingList);

  if (shoppingList == '') {
    divSuperList.innerHTML = ''
  } else {
    var html = '<ul>';
    for (var i = 0; i < shoppingList.length; i++) {
      html += '<li><button title="supprimer" onClick="javascript: removeItem(\'' + shoppingList[i] +
        '\')" class="crossButton" id="' + i + '">x</button>' + shoppingList[i] + '</li>';
    };
    html += '</ul>';
    divSuperList.innerHTML = html;
  }
}



// affiche le nombre total de produits dans la liste
function showTotalItems() {
  console.log("la liste contient " + shoppingList.length + " produits");
  var text = "La liste contient " + shoppingList.length + " produits";
  document.getElementById('nombreProduits').textContent = text;
}

function clearList() {
  shoppingList = [];
  console.clear();
  displayList();
  window.alert('Votre liste de course a été vidée !');
}
