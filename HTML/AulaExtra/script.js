document.addEventListener('DOMContentLoaded', function () {
    loadTasks();
});

function loadTasks() {
    const taskList = document.getElementById('taskList');
    taskList.innerHTML = '';
    const tasks = JSON.parse(localStorage.getItem('tasks')) || [];
    for (const task of tasks) {
        const li = document.createElement('li');
        li.textContent = task;
        const deleteButton = document.createElement('button');
        deleteButton.textContent = 'Excluir';
        deleteButton.onclick = function () {
            removeTask(task);
        };
        li.appendChild(deleteButton);
        taskList.appendChild(li);
    }
}

function addTask() {
    const taskInput = document.getElementById('task');
    const task = taskInput.value.trim();
    if (task !== '') {
        const tasks = JSON.parse(localStorage.getItem('tasks')) || [];
        tasks.push(task);
        localStorage.setItem('tasks', JSON.stringify(tasks));
        taskInput.value = '';
        loadTasks();
    }
}

function removeTask(task) {
    const tasks = JSON.parse(localStorage.getItem('tasks')) || [];
    const index = tasks.indexOf(task);
    if (index > -1) {
        tasks.splice(index, 1);
        localStorage.setItem('tasks', JSON.stringify(tasks));
        loadTasks();
    }
}
