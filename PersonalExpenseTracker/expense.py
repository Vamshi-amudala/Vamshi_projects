from flask import Flask, request, jsonify, render_template
import json
from datetime import datetime

app = Flask(__name__)

# Global variable to store expenses
expenses = []

# Load previous data from file (if exists)
def load_data(file_name='expenses.json'):
    global expenses
    try:
        with open(file_name, 'r') as file:
            expenses = json.load(file)
    except FileNotFoundError:
        print("No previous data found. Starting fresh.")

# Save data to file
def save_data(file_name='expenses.json'):
    with open(file_name, 'w') as file:
        json.dump(expenses, file)

# Add an expense
def add_expense(amount, category, date=None):
    if not date:
        date = datetime.now().strftime('%Y-%m-%d')
    expenses.append({
        'amount': amount,
        'category': category,
        'date': date
    })

@app.route('/')
def home():
    return render_template('ex.html')

@app.route('/add_expense', methods=['POST'])
def handle_add_expense():
    data = request.json
    add_expense(data['amount'], data['category'])
    save_data()
    return jsonify({'message': 'Expense added successfully!'})

@app.route('/view_summary', methods=['GET'])
def handle_view_summary():
    return jsonify(expenses)

if __name__ == '__main__':
    load_data()
    app.run(debug=True)
