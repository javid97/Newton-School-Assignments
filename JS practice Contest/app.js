const todoContainer = document.querySelector(".todo-list");
const submitBtn = document.querySelector(".todo-button");

submitBtn.addEventListener("click", (e) => {
  e.preventDefault();
  let inputEle = document.querySelector(".todo-input");
  let val = inputEle.value;
  addList(val);
  inputEle.value = null;
});

function addList(value) {
  const li = document.createElement("li");
  li.innerHTML = `
        <p class="todo-item">${value}</p>
        <button class="complete-btn" onClick="markCompleted(this)">Completed</button>
        <button class="trash-btn" onClick="removeList(this)">Delete</button>`;
  todoContainer.appendChild(li);
}

function removeList(target) {
  target.removeEventListener("click", (e) => removeList(e));
  target.parentElement.remove();
}

function markCompleted(target) {
  let classlist = target.parentElement.firstChild.nextElementSibling.classList;
  classlist.contains("textDecoration")
    ? classlist.remove("textDecoration")
    : classlist.add("textDecoration");
}
