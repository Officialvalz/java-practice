from datetime import datetime

movies_rating = {}


def add_movie(movie_choice):

    if not movie_choice or movie_choice.strip() == "":
        raise ValueError("Movie name cannot be empty")

    movie_choice = movie_choice.strip()

    if movie_choice in movies_rating:
        raise ValueError("Movie already exists")

    movies_rating[movie_choice] = {
        "movie rating": [],
        "Created at": datetime.now().strftime("%Y-%m-%d %H:%M:%S")
    }

    return movies_rating



def rate_movie(movie_choice, enter_rating):

    if movie_choice not in movies_rating:
        raise ValueError("Movie not found")

    if not isinstance(enter_rating, (int, float)):
        raise ValueError("Rating must be a number")

    if enter_rating < 1 or enter_rating > 5:
        raise ValueError("Rating must be between 1 and 5")

    movies_rating[movie_choice]["movie rating"].append(enter_rating)

    return enter_rating



def view_average_ratings(movie_choice):

    if movie_choice not in movies_rating:
        raise ValueError("Movie not found")

    ratings = movies_rating[movie_choice]["movie rating"]

    if len(ratings) == 0:
        return 0

    return round(sum(ratings) / len(ratings), 1)



def total_average_ratings():

    all_ratings = []

    for movie in movies_rating.values():
        all_ratings.extend(movie["movie rating"])

    if len(all_ratings) == 0:
        return 0

    return round(sum(all_ratings) / len(all_ratings), 1)



def exit_program():
    return "Exiting the program"



def menu():

    while True:
        print("\tWelcome to the BoXX Cinemas Movie Rating System\n")
        print("""\t\t1. Add Movie,
            2. Rate Movie,
            3. View Average Ratings,
            4. View Overall Average Ratings,
            5. Exit Program""")

        choice = input("\nEnter your choice:\n ")

        if choice == "1":
            movie_choice = input("\nEnter movie to add:\n ")
            try:
                add_movie(movie_choice)
                print(movies_rating)
            except ValueError as e:
                print(e)

        elif choice == "2":
            movie_choice = input("\nEnter movie name to rate:\n ")

            try:
                enter_rating = float(input("\nEnter your rating (1-5):\n "))
                rate_movie(movie_choice, enter_rating)
                print(movies_rating)

            except ValueError as e:
                print(e)

        elif choice == "3":
            movie_choice = input("\nEnter movie to view:\n ")

            try:
                avg = view_average_ratings(movie_choice)
                print(f"{movie_choice} Average Rating: {avg}")

            except ValueError as e:
                print(e)

        elif choice == "4":
            print(f"All Movie Rating is: {total_average_ratings()}")

        elif choice == "5":
            print(exit_program())
            break

        else:
            print("Please enter a valid choice (1-5)")
