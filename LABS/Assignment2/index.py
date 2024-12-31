class Database:
    def connect(self):
        return "Connected to Database"


class UserService:
    def __init__(self):
        self.db = Database()  # Tightly coupled to Database

    def get_user(self, user_id):
        if self.db.connect():
            return f"Fetching user {user_id}"


# Usage
user_service = UserService()
print(user_service.get_user(123))



class Database:
    def connect(self):
        return "Connected to Database"


class UserService:
    def __init__(self, db: Database):  # Dependency Injection
        self.db = db

    def get_user(self, user_id):
        if self.db.connect():
            return f"Fetching user {user_id}"


# Usage
db = Database()  # Database is created outside
user_service = UserService(db)  # Database is injected
print(user_service.get_user(123))
