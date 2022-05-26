

function display() {
  var slim = `
  <div id="part1">

  <strong>Talan Academy</strong> est une école de reconverion interne à <a href="https://talan.com">Talan</a>, qui propose une formation professionnalisante basée sur une pédagogie innovante.

  </div>

  <div id="part2">

      <p>Les cursus proposés :</p>

      <ul>

          <li>Java</li>

          <li>PHP</li>

          <li>Test et validation</li>

      </ul>

  </div>`;

    document.getElementById("slim").innerHTML =  slim;
}
