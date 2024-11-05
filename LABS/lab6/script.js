document.getElementById('processButton').addEventListener('click', processInput);

function processInput() {
    const inputData = document.getElementById('inputData').value;
    const output = applyFilters(inputData);
    document.getElementById('outputData').innerText = output;
}

function applyFilters(data) {
    // Pipe and Filter Architecture: Data flows through a series of filters
    data = filterToUpperCase(data); // Filter 1: Convert to Uppercase
    data = filterRemoveVowels(data); // Filter 2: Remove vowels
    data = filterReverse(data); // Filter 3: Reverse the string
    return data;
}

// Filter 1: Convert to Uppercase
function filterToUpperCase(data) {
    return data.toUpperCase();
}

// Filter 2: Remove Vowels
function filterRemoveVowels(data) {
    return data.replace(/[aeiouAEIOU]/g, '');
}

// Filter 3: Reverse the string
function filterReverse(data) {
    return data.split('').reverse().join('');
}
